package io.github.kyledolezal.touttracker.controllers

import net.minidev.json.JSONObject

import org.springframework.dao.DataIntegrityViolationException
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import com.google.common.base.Throwables

@ControllerAdvice
class RestResponseEntityExceptionHandler : ResponseEntityExceptionHandler() {
    @ExceptionHandler(value = [DataIntegrityViolationException::class])
    protected fun handleIntegrityViolation(
            ex: RuntimeException?, request: WebRequest?): ResponseEntity<Any> {
        val rootCause = ex?.let { Throwables.getRootCause(it) }.toString()
        val invalidField = "(?<=Detail: Key \\().+(?=\\)=)".toRegex().find(rootCause)?.value
        val errorMsg = (invalidField ?: "Data") + " is invalid."

        val bodyOfResponse = JSONObject(mapOf("errors" to arrayOf(errorMsg)))
        return handleExceptionInternal(ex!!, bodyOfResponse,
                HttpHeaders(), HttpStatus.BAD_REQUEST, request!!)
    }
}
