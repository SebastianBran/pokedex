import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

const routes = [
    {
        path: "/",
        name: "Home",
        component: () => import("../views/Home")
    },
    {
        path: "/pokemons",
        name: "Pokemons",
        component: () => import("../views/Pokemons"),
    },
    {
        path: "/pokemons/information/:name",
        name: "Information",
        component: () => import("../views/Information"),
    }
];

const router = new VueRouter({
    mode: "history",
    base: process.env.BASE_URL,
    routes
});

export default router;