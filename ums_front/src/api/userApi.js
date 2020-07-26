import axios from 'axios'

const selectUserApi = "/api/user/selectAllUser";
const insertUserApi = "/api/user/insertUser";
const deleteUserApi = "/api/user/deleteUser";
const updateUserApi = "/api/user/updateUser";
const selectTheUserApi = "/api/user/selectTheUser";

export async function  selectUser() {
    const resp = await axios.get(
        selectUserApi,
    );
    return resp.data;
}

export async function  insertUser(params) {
    const resp = await axios.post(
        insertUserApi,
        params,
    );
    return resp.data;
}

export async function  deleteUser(params) {
    const resp = await axios.delete(
        `${deleteUserApi}?id=${params}`,
        params,
    );
    console.log(resp);
    return resp.data;
}

export async function  updateUser(params) {
    const resp = await axios.post(
        updateUserApi,
        params,
    );
    return resp.data;
}

export async function  selectTheUser(params) {
    const resp = await axios.get(
        `${selectTheUserApi}?id=${params}`,
        params,
    );
    return resp.data;
}

