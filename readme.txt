 Volume in drive C is OS
 Volume Serial Number is 38E4-68D8

 Directory of C:\Users\DavidHolberton\sbprojs\httpsucapp

06/30/2024  09:02 AM    <DIR>          gradle
06/30/2024  09:02 AM    <DIR>          src
07/14/2024  06:18 PM    <DIR>          ..
07/14/2024  06:19 PM    <DIR>          .
06/30/2024  09:02 AM             2,918 gradlew.bat
06/30/2024  09:02 AM                32 settings.gradle
06/30/2024  09:02 AM             2,414 HELP.md
06/30/2024  09:02 AM             8,706 gradlew
06/30/2024  09:02 AM               444 .gitignore
06/30/2024  09:02 AM             1,169 build.gradle
07/14/2024  06:19 PM                 0 readme.txt
               7 File(s)         15,683 bytes
               4 Dir(s)  488,775,856,128 bytes free
Folder PATH listing for volume OS
Volume serial number is 38E4-68D8
C:.
|   .gitignore
|   build.gradle
|   gradlew
|   gradlew.bat
|   HELP.md
|   readme.txt
|   settings.gradle
|   
+---gradle
|   \---wrapper
|           gradle-wrapper.jar
|           gradle-wrapper.properties
|           
\---src
    +---main
    |   +---java
    |   |   \---ashburncode
    |   |       \---httpsucapp
    |   |               HttpsucappApplication.java
    |   |               
    |   \---resources
    |       |   application.properties
    |       |   
    |       +---static
    |       \---templates
    \---test
        \---java
            \---ashburncode
                \---httpsucapp
                        HttpsucappApplicationTests.java
                        
C:\Users\DavidHolberton\sbprojs\httpsucapp>
C:\Users\DavidHolberton\sbprojs\httpsucapp>.\gradlew --version

------------------------------------------------------------
Gradle 8.8
------------------------------------------------------------

Build time:   2024-05-31 21:46:56 UTC
Revision:     4bd1b3d3fc3f31db5a26eecb416a165b8cc36082

Kotlin:       1.9.22
Groovy:       3.0.21
Ant:          Apache Ant(TM) version 1.10.13 compiled on January 4 2023
JVM:          17.0.7 (Oracle Corporation 17.0.7+8-LTS-224)
OS:           Windows 11 10.0 amd64

C:\Users\DavidHolberton\sbprojs\httpsucapp>

cd C:\Users\DavidHolberton\sbprojs\httpsucapp
.\gradlew clean
.\gradlew bootJar
dir /o:gd build
dir /o:gd build\libs
java -jar build\libs\httpsucapp-0.0.1-SNAPSHOT.jar
java -Djavax.net.debug=ssl:handshake -jar build\libs\httpsucapp-0.0.1-SNAPSHOT.jar
java -jar build\libs\httpsucapp-0.0.1-SNAPSHOT.jar > httpsucapp-startspringio-20240716a.txt
java -Djavax.net.debug=ssl:handshake -jar build\libs\httpsucapp-0.0.1-SNAPSHOT.jar > httpsucapp-startspringio-20240716b.txt
java -Djavax.net.debug=ssl:handshake -jar build\libs\httpsucapp-0.0.1-SNAPSHOT.jar 2> httpsucapp-startspringio-20240716c.txt
java -Djavax.net.debug=ssl:handshake -jar build\libs\httpsucapp-0.0.1-SNAPSHOT.jar 2>&1 httpsucapp-startspringio-20240716d.txt
java -Djavax.net.debug=ssl:handshake -jar build\libs\httpsucapp-0.0.1-SNAPSHOT.jar > httpsucapp-startspringio-20240716e.txt 2>&1
java -Dorg.asynchttpclient.enabledProtocols=TLSv1.3 -Dorg.asynchttpclient.enabledCipherSuites=TLS_AES_256_GCM_SHA384 -Djavax.net.debug=ssl:handshake -jar build\libs\httpsucapp-0.0.1-SNAPSHOT.jar >httpsucapp-startspringio-20240716f.txt 2>&1

C:\Users\DavidHolberton\sbprojs\httpsucapp>dir /o:gd
 Volume in drive C is OS
 Volume Serial Number is 38E4-68D8

 Directory of C:\Users\DavidHolberton\sbprojs\httpsucapp

06/30/2024  09:02 AM    <DIR>          gradle
06/30/2024  09:02 AM    <DIR>          src
07/14/2024  08:45 PM    <DIR>          ..
07/16/2024  08:55 AM    <DIR>          .gradle
07/16/2024  09:19 AM    <DIR>          build
07/16/2024  09:25 AM    <DIR>          .
06/30/2024  09:02 AM             2,918 gradlew.bat
06/30/2024  09:02 AM                32 settings.gradle
06/30/2024  09:02 AM               444 .gitignore
06/30/2024  09:02 AM             8,706 gradlew
06/30/2024  09:02 AM             2,414 HELP.md
07/14/2024  02:21 PM             1,199 build.gradle
07/16/2024  09:23 AM             6,891 httpsucapp-startspringio-20240716a.txt
07/16/2024  09:23 AM             6,891 httpsucapp-startspringio-20240716b.txt
07/16/2024  09:24 AM            25,820 httpsucapp-startspringio-20240716c.txt
07/16/2024  09:25 AM            34,522 httpsucapp-startspringio-20240716e.txt
07/16/2024  09:25 AM            34,511 httpsucapp-startspringio-20240716f.txt
07/16/2024  09:29 AM             3,271 readme.txt
              12 File(s)        127,619 bytes
               6 Dir(s)  484,259,897,344 bytes free

C:\Users\DavidHolberton\sbprojs\httpsucapp>

