<template>
  <div>
    <el-table
      :data="tableData"
      style="width: 100%">
<!--      expand-->
      <el-table-column fixed type="expand">
        <template slot-scope="props">
          <el-form label-position="left" inline class="demo-table-expand">
            <el-form-item label="商品名称">
              <span>{{ props.row.name }}</span>
            </el-form-item>
            <el-form-item label="所属店铺">
              <span>{{ props.row.shop }}</span>
            </el-form-item>
            <el-form-item label="商品 ID">
              <span>{{ props.row.id }}</span>
            </el-form-item>
            <el-form-item label="店铺 ID">
              <span>{{ props.row.shopId }}</span>
            </el-form-item>
            <el-form-item label="商品分类">
              <span>{{ props.row.category }}</span>
            </el-form-item>
            <el-form-item label="店铺地址">
              <span>{{ props.row.address }}</span>
            </el-form-item>
            <el-form-item label="商品描述">
              <span>{{ props.row.desc }}</span>
            </el-form-item>
          </el-form>
        </template>
      </el-table-column>
      <el-table-column
        fixed
        label="URL"
        prop="id">
      </el-table-column>
      <el-table-column
        label="截图"
        prop="name">
        <template slot-scope="scope">
          <el-popover
            placement="right"
            title=""
            trigger="hover">
            <img :src="scope.row.photoUrl"
                 style="max-height: 700px;max-width: 500px"/>
            <img slot="reference"
                 :src="scope.row.photoUrl"
                 :alt="scope.row.photoUrl"
                 style="max-height: 100px;max-width: 100px">
          </el-popover>
        </template>
      </el-table-column>
      <el-table-column
        label="详情">
        <template slot-scope="scope">
          <el-input
            type="textarea"
            :rows="2"
            placeholder="请输入内容"
            v-model="scope.row.desc">
          </el-input>
        </template>
      </el-table-column>
      <el-table-column
        fixed="right"
        label="操作"
        width="90">
        <template slot-scope="scope">
          <el-button type="primary" size="medium">保存</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  layout:'index',
  // head 的数据配置，title等数据
  head(){
    return {
      title:'Index',
      meta:[]
    }
  },
  //数据
  data() {
    return {
      tableData: [{
        id: '12987122',
        name: '好滋好味鸡蛋仔',
        category: '江浙小吃、小吃零食',
        desc: '荷兰优质淡奶，奶香浓而不腻',
        address: '上海市普陀区真北路',
        shop: '王小虎夫妻店',
        shopId: '10333',
        photoUrl:['https://fuss10.elemecdn.com/1/8e/aeffeb4de74e2fde4bd74fc7b4486jpeg.jpeg']
      }, {
        id: '12987123',
        name: '好滋好味鸡蛋仔',
        category: '江浙小吃、小吃零食',
        desc: '荷兰优质淡奶，奶香浓而不腻',
        address: '上海市普陀区真北路',
        shop: '王小虎夫妻店',
        shopId: '10333'
      }, {
        id: '12987125',
        name: '好滋好味鸡蛋仔',
        category: '江浙小吃、小吃零食',
        desc: '荷兰优质淡奶，奶香浓而不腻',
        address: '上海市普陀区真北路',
        shop: '王小虎夫妻店',
        shopId: '10333'
      }, {
        id: '12987126',
        name: '好滋好味鸡蛋仔',
        category: '江浙小吃、小吃零食',
        desc: '荷兰优质淡奶，奶香浓而不腻',
        address: '上海市普陀区真北路',
        shop: '王小虎夫妻店',
        shopId: '10333'
      }]
    }
  },
  //方法
  methods:{
    test(){
      this.getRequest("/api/test",{
        name:1
      })
        .then(resp => {
          this.name = resp.data
        })
    },
  },
  mounted(){

  },
  //组件
  components: {
    // header
  }
}
</script>

<style>
  .demo-table-expand {
    font-size: 0;
  }
  .demo-table-expand label {
    width: 90px;
    color: #99a9bf;
  }
  .demo-table-expand .el-form-item {
    margin-right: 0;
    margin-bottom: 0;
    width: 50%;
  }
</style>
