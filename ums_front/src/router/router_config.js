const router_config={
    mode: "history",
    routes: [
        {
            path: "/",
            name: "info",
            component: ()=>import("../views/Info"),
        },
        {
            path: "/About",
            name: "about",
            component: ()=>import("../views/About"),
        },
        {
            path: "/Add",
            name: "add",
            component: ()=>import("../views/Add"),
        },
        {
            path: "/Detail",
            name: "detail",
            component: ()=>import("../views/Detail"),
        },
    ]
}

export default router_config;

