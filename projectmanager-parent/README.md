# FSDFINALPROJECT:Project Manager
<h2>Associate Name:Jyotibikash Mahakuda</h2>
<h2>Please refer to the "docs" folder which contain the following sub-folders</h2>
<ol>
	<li>application_screenshots : This contains application screenshots of all screens.</li>
	<li>mysql_database_script : This contains table design and the DDL commands </li>
	<li>junit-emma_coverage_report : This contains the junit test cases, emma code coverage report and screenshots.</li>
	<li>jmeter_load_testing_report : This contains the screenshots of the jmeter execution on the rest end-point designed</li>
	<li>docker : This contains the docker commands and screenshots of the project docker image creation and execution.</li>
</ol>
<h3>Following are the projects which comprise of the full-stack project:Project Manager</h3>
<ol>
   <li><h4>"projectmanager-server" - The spring boot project using Rest API,hibernate etc running in the back-end </h4></li>
   <li><h4>"projectmanager-web" - The angular project using HTML5,CS3,Bootstrap4 running in the front end</h4></li>
</ol>
<h3>Final Build Commands:</h3>
<ul>
<li>Maven: clean install -e [The UI code is build using "frontend-maven-plugin" and is packed inside the JAR artifacts itself. Refer projectmanager-web pom.xml](Command is mvn clean install)</li>
<li>Docker: package docker:build[spotify "docker-maven-plugin" is used to create image in the remote docker. <dockerHost> configuration : pom.xml of projectmanager-server](Command is mvn package docker:build)</li>
</ul>

<h3>Docker Execution Commands:</h3>
<ul>
<li>Pull the app image from docker cloud :docker pull jyotibikash/fsdfinalproject:projectmanager</li>
<li>Then Run the command : docker run -t --name projectmanager-container -p 8084:8084 jyotibikash/fsdfinalproject:projectmanager</li>
<li>See log and hit URL to check application http://localhost:8084/</li>
</ul>	

<h3>Local Deployment Commands:</h3>
<ul>
<li>Spring boot in projectmanager-server folder: spring-boot:run</li>
<li>Angular ui in web folder of projectmanager-web: npm install -> npm start</li>
</ul>

<h3>Notes: </h3>
<ol>
<li>The free hosting public MySQL database jdbc:mysql://sql12.freemysqlhosting.net:3306/dbname is usedto access database layer when deployed in docker (instead of setting mysql in docker).</li>
<li>Please refer to the mysql script for the database DDL</li>
<li>Before the maven build, please change the port number in envioronment.prod.ts to change the port number in which the jar is get deployed.</li>
</ol>


