Invoke-WebRequest -OutFile swagger-codegen-cli.jar http://central.maven.org/maven2/io/swagger/swagger-codegen-cli/2.3.1/swagger-codegen-cli-2.3.1.jar
java -jar swagger-codegen-cli.jar generate -i https://api.opendota.com/api -l kotlin -o .
Remove-Item swagger-codegen-cli.jar