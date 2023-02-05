> # 남궁성의 Spring Boot 강좌 - 기본편
> Spring Boot 입문자를 위한 최고의 강좌 - https://fastcampus.co.kr/dev_academy_nks2  
> Spring framework 강좌 - 심화편(준비중)  
> Spring boot 강좌 - 심화편(준비중)  
> email : seong.namkung@gmail.com    
> 수강생 전용 Q&A : https://cafe.naver.com/javachobostudy?iframe_url=/ArticleList.nhn%3Fsearch.clubid=10286641%26search.menuid=221%26search.boardtype=L   
<br>

# Part1. Spring Boot 시작하기
## 1. 개요    
  - ### Spring Boot란?   
    Spring makes programming Java quicker, easier, and safer for everybody.   
    Spring’s focus on speed, simplicity, and productivity has made it the world's most popular Java framework.      
    https://spring.io/why-spring  

  - ### Spring MVC란?  
    A Spring MVC is a framework to build web applications. It follows the MVC(Model-View-Controller) design pattern.
    https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html  
    <br>
    **[참고]** MVC패턴이란? https://developer.mozilla.org/ko/docs/Glossary/MVC  
<br>

## 2. 개발 도구 설치 & 설정  

1. JDK11 설치  
    [자바의 정석 - 무료강의] https://youtube.com/playlist?list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp  

    [Windows] https://download.java.net/java/ga/jdk11/openjdk-11_windows-x64_bin.zip

    [Mac] SDKMAN을 이용해서 openJDK설치

   - SDKMAN 설치 - https://sdkman.io/install  

   ```
    $ curl -s "https://get.sdkman.io" | bash
    $ source "$HOME/.sdkman/bin/sdkman-init.sh"    
   ```

   - SDKMAN 명령어  
   ```
    $ sdk version  <--- sdkman 버전출력  
    $ sdk list java  <-- 설치 가능 & 설치된 JDK목록  
    $ sdk install java 11.0.12.7.2-amzn <--- 지정된 JDK설치(원하는 종류와 버전 지정)  
    $ sdk default java 11.0.12.7.2-amzn <--- 사용할 java버전을 변경(모든 쉘에 적용)
    $ sdk use java 11.0.12.7.2-amzn <--- 사용할 java버전을 변경(현재 쉘에만 적용)  
    $ sdk current java <--- 현재 사용중인 java버전 출력  
    $ echo $JAVA_HOME  <--- JAVA_HOME으로 지정된 경로 출력
   ```
   **[참고]** openJDK버전별 다운로드 - https://jdk.java.net/archive/
<br>
<br>
  
2. IntelliJ 설치   
**Windows** - https://www.jetbrains.com/idea/download/#section=windows  
**MacOS** - https://www.jetbrains.com/idea/download/#section=mac  
**MacOS M1** - https://www.jetbrains.com/idea/download/download-thanks.html?platform=macM1  

[참고] IntelliJ 학생 라이센스 - https://www.jetbrains.com/shop/eform/students  
<br>


3. MySQL 설치   
https://downloads.mysql.com/archives/community/  
