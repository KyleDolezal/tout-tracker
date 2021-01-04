import axios from "axios";

const API_URL = "http://localhost:8080/api/";

class AuthService {
  currentUser() {
    return JSON.parse(localStorage.getItem('currentUser'));
  }

  register(username, email, password) {
    return axios.post(API_URL + "register", {
      username,
      email,
      password
    });
  }
}

export default new AuthService();