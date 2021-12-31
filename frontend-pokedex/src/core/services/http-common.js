import axios from "axios";

export default axios.create({
    baseURL: "http://localhost:8080/",
    headers: {
        "content-type": "application/json",
        "Access-Control-Allow-Origin": "*",
        "Access-Control-Allow-Methods": "GET,PUT,POST,DELETE,PATCH,OPTIONS"
    }
});