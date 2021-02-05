(this.webpackJsonpclient=this.webpackJsonpclient||[]).push([[0],{153:function(e,a,t){"use strict";t.r(a);var n=t(1),s=t.n(n),r=t(36),l=t.n(r),c=(t(48),t(49),t(50),t(7)),o=t(8),i=t(37),m=t.n(i),u=new(function(){function e(){Object(c.a)(this,e)}return Object(o.a)(e,[{key:"currentUser",value:function(){return JSON.parse(localStorage.getItem("currentUser"))}},{key:"register",value:function(e,a,t){return m.a.post("http://localhost:8080/api/register",{username:e,email:a,password:t})}}]),e}()),h=t(4),d=t(42),g=t(41),f=t(38),v=t.n(f),p=t(9),E=t.n(p),b=t(39),w=t.n(b),N=t(40),C=function(e){if(!e)return s.a.createElement("div",{className:"alert alert-danger",role:"alert"},"This field is required!")},y=function(e){if(!Object(N.isEmail)(e))return s.a.createElement("div",{className:"alert alert-danger",role:"alert"},"This is not a valid email.")},k=function(e){if(e.length<3||e.length>20)return s.a.createElement("div",{className:"alert alert-danger",role:"alert"},"The username must be between 3 and 20 characters.")},O=function(e){if(e.length<6||e.length>40)return s.a.createElement("div",{className:"alert alert-danger",role:"alert"},"The password must be between 6 and 40 characters.")},S=function(e){Object(d.a)(t,e);var a=Object(g.a)(t);function t(e){var n;return Object(c.a)(this,t),(n=a.call(this,e)).handleRegister=n.handleRegister.bind(Object(h.a)(n)),n.onChangeUsername=n.onChangeUsername.bind(Object(h.a)(n)),n.onChangeEmail=n.onChangeEmail.bind(Object(h.a)(n)),n.onChangePassword=n.onChangePassword.bind(Object(h.a)(n)),n.state={username:"",email:"",password:"",successful:!1,message:""},n}return Object(o.a)(t,[{key:"onChangeUsername",value:function(e){this.setState({username:e.target.value})}},{key:"onChangeEmail",value:function(e){this.setState({email:e.target.value})}},{key:"onChangePassword",value:function(e){this.setState({password:e.target.value})}},{key:"handleRegister",value:function(e){var a=this;e.preventDefault(),this.setState({message:"",successful:!1}),this.form.validateAll(),0===this.checkBtn.context._errors.length&&u.register(this.state.username,this.state.email,this.state.password).then((function(e){a.setState({message:e.data.message,successful:!0})}),(function(e){var t=e.response&&e.response.data&&e.response.data.message||e.message||e.toString();a.setState({successful:!1,message:t})}))}},{key:"render",value:function(){var e=this;return s.a.createElement("div",{className:"col-md-12"},s.a.createElement("div",{className:"card card-container"},s.a.createElement("img",{src:"//ssl.gstatic.com/accounts/ui/avatar_2x.png",alt:"profile-img",className:"profile-img-card"}),s.a.createElement(v.a,{onSubmit:this.handleRegister,ref:function(a){e.form=a}},!this.state.successful&&s.a.createElement("div",null,s.a.createElement("div",{className:"form-group"},s.a.createElement("label",{htmlFor:"username"},"Username"),s.a.createElement(E.a,{type:"text",className:"form-control",name:"username",value:this.state.username,onChange:this.onChangeUsername,validations:[C,k]})),s.a.createElement("div",{className:"form-group"},s.a.createElement("label",{htmlFor:"email"},"Email"),s.a.createElement(E.a,{type:"text",className:"form-control",name:"email",value:this.state.email,onChange:this.onChangeEmail,validations:[C,y]})),s.a.createElement("div",{className:"form-group"},s.a.createElement("label",{htmlFor:"password"},"Password"),s.a.createElement(E.a,{type:"password",className:"form-control",name:"password",value:this.state.password,onChange:this.onChangePassword,validations:[C,O]})),s.a.createElement("div",{className:"form-group"},s.a.createElement("button",{className:"btn btn-primary btn-block"},"Sign Up"))),this.state.message&&s.a.createElement("div",{className:"form-group"},s.a.createElement("div",{className:this.state.successful?"alert alert-success":"alert alert-danger",role:"alert"},this.state.message)),s.a.createElement(w.a,{style:{display:"none"},ref:function(a){e.checkBtn=a}}))))}}]),t}(n.Component),j=function(e){return u.currentUser()?s.a.createElement("p",null,"Welcome, user"):s.a.createElement(S,null)};var U=function(){return s.a.createElement("div",{className:"App"},s.a.createElement("header",{className:"App-header"},s.a.createElement(j,null)))};Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));l.a.render(s.a.createElement(s.a.StrictMode,null,s.a.createElement(U,null)),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))},43:function(e,a,t){e.exports=t(153)},48:function(e,a,t){},49:function(e,a,t){e.exports=t.p+"static/media/logo.5d5d9eef.svg"},50:function(e,a,t){}},[[43,1,2]]]);
//# sourceMappingURL=main.1a040213.chunk.js.map