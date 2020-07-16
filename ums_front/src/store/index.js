import Vue from 'vue'
import Vuex from 'vuex'
import store_config from './store_config'

Vue.use(Vuex)

const store = new Vuex.Store(store_config)

export default store
