
const vueConfig = {
  devServer: {
    port: 8081,
    proxy: {
      '/api': {
        target: 'http://192.168.43.89:8080',
      }
    }
  },
};

module.exports = vueConfig
