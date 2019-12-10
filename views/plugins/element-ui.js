import Vue from 'vue'
import Element from 'element-ui'
import locale from 'element-ui/lib/locale/lang/en'

Vue.use(Element, { locale });

import {getRequest} from './utils/api'
import {postRequest} from './utils/api'
import {postRequestJson} from './utils/api'
import {deleteRequest} from './utils/api'
import {putRequest} from './utils/api'
import {uploadFileRequest} from './utils/api'
import {formatTime} from './utils/api'

//各类请求的配置(可以用 this. 使用)
Vue.prototype.getRequest = getRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.postRequestJson = postRequestJson;
Vue.prototype.formatTime = formatTime;
Vue.prototype.deleteRequest = deleteRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.uploadFileRequest = uploadFileRequest;
