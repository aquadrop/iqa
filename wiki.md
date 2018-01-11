# Introduction
月入十万. 可惜时机有点晚. 一定完成项目!!!

## 模块和功能
|模块||目录|
|--:|--:|--:|
|出题模块|出题和判断对错|com.automata.core.quiz.[service, model]
|积分模块|读取写入用户积分|com.automata.core.assess
|用户模块|读取写入用户信息|com.automata.core.profile
|匹配模块|匹配用户|com.automata.core.match
|房间模块|房间管理软件|com.automata.core.room
|机器人模块|模拟软件|com.automata.core.bot
|REST|rest 接口|com.automata.web

## 模块细节/产品设计

### 出题模块

#### 数据库设计

|字段|解释|举例|
|--:|--:|--:|
|科目||数学题,100以内加减法
|难度等级||五星难度
|题目类型||选择题,简答题
|数据源|数据源|随机生成,数据库
|题目||床前明月光的下一句是_
|题目介质||图片,音频,文字的组合
|提示||李白的诗
|候选项|如果是简答题可以没有|候选项包含标号和内容(可以是图片,音频,文字组合)
|标准答案||疑是地上霜

### 匹配模块
可以使用kafka等消息队列生成

