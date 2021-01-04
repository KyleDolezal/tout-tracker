import React from 'react';
import { Route, Redirect } from 'react-router-dom';
import AuthService from '../services/AuthenticationService'
import Register from './auth/Register'

const Home = (props) => {
	if (!AuthService.currentUser()) {
		return <Register/>
	}

	return <p>Welcome, user</p>
}

export default Home;
