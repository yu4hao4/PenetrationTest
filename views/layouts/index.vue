<template>
  <div>
<!--    布局，用于 index 页面-->
    <el-container style="position:absolute;top:0;bottom:0;left: 0;right:0">
<!--      头部-->
      <el-header>
        <el-row>
          <el-col :span="20" :offset="2">
            <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
                  <el-menu-item>
                    <el-input size="mini" placeholder="搜索"></el-input>
                  </el-menu-item>
                  <el-menu-item index="1">主页</el-menu-item>
                  <el-submenu index="2">
                    <template slot="title">下拉菜单</template>
                    <el-menu-item index="2-1">选项1</el-menu-item>
                    <el-menu-item index="2-2">选项2</el-menu-item>
                    <el-menu-item index="2-3">选项3</el-menu-item>
                    <el-submenu index="2-4">
                      <template slot="title">选项4</template>
                      <el-menu-item index="2-4-1">选项1</el-menu-item>
                      <el-menu-item index="2-4-2">选项2</el-menu-item>
                      <el-menu-item index="2-4-3">选项3</el-menu-item>
                    </el-submenu>
                  </el-submenu>
                  <el-menu-item index="3" disabled>禁止标签</el-menu-item>
                  <el-menu-item index="4"><a href="https://www.ele.me" target="_blank">跳转标签</a></el-menu-item>
            </el-menu>
          </el-col>
        </el-row>
      </el-header>
      <el-main>
        <el-row :gutter="10">
          <el-col :span="20" :offset="2">
            <nuxt/>
          </el-col>
        </el-row>
      </el-main>
      <el-footer>底部</el-footer>
    </el-container>
  </div>
</template>

<script>
  export default {
    name: "index",
    data() {
      return {
        activeIndex: '1',
        activeIndex2: '1'
      };
    },
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>

<style scoped>
</style>
