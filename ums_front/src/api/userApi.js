import axios from 'axios'

const selectUserApi = "/api/user/selectAllUser";
const insertUserApi = "/api/user/insertUser";
const deleteUserApi = "/api/user/deleteUser";
const updateUserApi = "/api/user/updateUser";
const selectTheUserApi = "/api/user/selectTheUser";

export async function  selectUser() {
    const resp = await axios({
        methods: 'get',
        url: selectUserApi,
        headers: {
            'Content-Type': 'application/json;charset=UTF-8'
        }
    });
    return resp.data;
}

export async function  insertUser(params) {
    const resp = await axios({
        methods: 'post',
        url: insertUserApi,
        params: params,
        headers: {
            'Content-Type': 'application/json;charset=UTF-8'
        }
    });
    return resp.data;
}

export async function  deleteUser(params) {
    const resp = await axios({
        methods: 'delete',
        url: deleteUserApi,
        params: params,
        headers: {
            'Content-Type': 'application/json;charset=UTF-8'
        }
    });
    console.log(resp);
    return resp.data;
}

export async function  updateUser(params) {
    const resp = await axios({
        methods: 'put',
        url: updateUserApi,
        params: params,
        headers: {
            'Content-Type': 'application/json;charset=UTF-8'
        }
    });
    return resp.data;
}

export async function  selectTheUser(params) {
    console.log(params);
    const resp = await axios({
        methods: 'get',
        url: selectTheUserApi,
        params: params,
        headers: {
            'Content-Type': 'application/json;charset=UTF-8'
        }
    });
    return resp.data;
}

