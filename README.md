# ReadYDK
读取YDK文件的Java项目

构建一个java maven 项目之后将src目录下文件的复制到src下，在pom文件中添加
~~~~
<dependency>
  <groupId>org.xerial</groupId>
  <artifactId>sqlite-jdbc</artifactId>
  <version>3.36.0.3</version>
  </dependency>
~~~~
##演示
~~~java
public class Main {
    public static void main(String[] args) {
        System.out.println(ReadYDK.get("E:/游戏/ygopro/WindBot/Decks/AI_Zoodiac.ydk",
                "D:\\2017\\Python\\Dictionary\\code\\sql\\cards_chinese.cdb"));
        System.out.println(ReadYDK.getOnly("E:/游戏/ygopro/WindBot/Decks/AI_Zoodiac.ydk",
                "D:\\2017\\Python\\Dictionary\\code\\sql\\cards_chinese.cdb"));
    }
}
~~~
**getOnly 去重重复的牌**
**get 读取完整的ydk**
**第一个参数 ydk路径，第二个参数为ygopro数据库文件路径**
