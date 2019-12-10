<template>
  <div>
    {{name}}
    <el-button @click="test">测试</el-button>
  </div>
</template>

<script>
export default {
  // head 的数据配置，title等数据
  head(){
    return {
      title:'Index',
      meta:[]
    }
  },
  //数据
  data (){
    return {
      name:1,
    }
  },
  //方法
  methods:{
    test(){
      this.getRequest("/api/test",{
        name:1
      })
    },
  },
  mounted(){

  },
  //组件
  components: {
    // Logo
  }
  //异步获取数据，在页面渲染前用到
  // asyncData ({ params }, callback) {
  //   axios.get(`http://localhost:8081/test`)
  //     .then((res) => {
  //       callback(null, { title: res.data.title })
  //     })
  // },
}
</script>

<style>
</style>
