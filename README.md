# TodoWebApplication

## Description　－　説明
Create a Web application that manages the Todo list in Java.

JavaでTodoリストを管理するWebアプリケーションを作成します。

## Creation procedure (for recording)　－　作成手順(メモ用)
 1. Create a template with [Spring Initializr](https://start.spring.io/).
 2. After unzipping the zip file, place it in a suitable folder.
 3. Create a database with MySQL.
 4. Describe in /src/main/resources/application.properties as follows.
 5. Run /src/main/java/com/example/xx.java
 6. Open localhost:8080 with firefox.<br>
    If an error page is displayed, the connection with the database is completed.
  ```java:application.properties
  spring.datasource.url=jdbc:mysql://localhost:xxxx(PortNumber)/yyyy(DBname)?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
  spring.datasource.username= // username
  spring.datasource.password= // password
  spring.jpa.database=MYSQL
  spring.jpa.hibernate.ddl-auto=update
  ```

 1. [Spring Initializr](https://start.spring.io/)でテンプレートを作成する。
 2. zipファイルを解凍後、適当なフォルダにおく。
 3. MySQLでデータベースを作成する。
 4. /src/main/resources/application.properties に以下のように記述する。
 5. /src/main/java/com/example/xx.java を実行する
 6. localhost:8080 をfirefoxで開く。なんかよくわかんないエラーページが表示されればとりあえず接続成功！
  ```java:application.properties
  spring.datasource.url=jdbc:mysql://localhost:xxxx(PortNumber)/yyyy(DBname)?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
  spring.datasource.username= // username
  spring.datasource.password= // password
  spring.jpa.database=MYSQL
  spring.jpa.hibernate.ddl-auto=update
  ```

## Database Infomation - データベースの情報
* DataBaseName : sample_db
* TableName : todolist
 * Id : There is no particular meaning.(?)<br>
  Int(5)
 * todo_name : todo title<br>
  varchar(255)
 * todo_time : todo deadline<br>
  varchar(255)
```sql:createDataBase
 CREATE DATABASE sample_db;
 use sample_db;
 CREATE TABLE todolist (id int(5), todo_name varchar(255), todo_time varchar(255));
```

* データベース名 : sample_db
* テーブル名 : todolist
 * Id : 特に意味はない(?)<br>
  Int(5)
 * todo_name : Todo名を格納する<br>
  varchar(255)
 * todo_time : Todoの期限を格納する<br>
  varchar(255)
```sql:createDataBase
 CREATE DATABASE sample_db;
 use sample_db;
 CREATE TABLE todolist (id int(5), todo_name varchar(255), todo_time varchar(255));
```
