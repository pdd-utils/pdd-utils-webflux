# 拼多多非官方接口

参考拼多多开发平台接口文档实现，并参考其sdk的封装，实现对于webflux场景下的支持。目前上传到个人maven仓库，后续有其他需求，考虑中央仓库方案。

## 特殊功能

1. 采用mapstruct的方式，对部分重复代码进行映射，保证不破坏原生bean定义，却能够减少调用端的代码实现。
2. 采用webflux的方式，实现异步调用。
3. 保留原始api的协议。

## 删除部分能力

1. 暂不支持GET请求。仅支持POST请求。
2. 不支持文件上传。
3. 仅支持部分api。其他缺少bean的api，看后续需求。

# 链接

1. [拼多多开发平台](https://open.pinduoduo.com/application/document/browse)
