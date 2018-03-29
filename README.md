# VICINITY_VAS_Adapters

Both Adapters Implement the folowwing endpoints:

## Actions<br />
POST /objects/{oid}/actions/{aid}<br />
GET /objects/{oid}/actions/{aid} (this is subject to change)<br />

## Properties<br />
GET /objects/{oid}/properties/{pid}<br />
PUT /objects/{oid}/properties/{pid}

## Events<br />
PUT /objects/{oid}/events/{eid}<br />

## Thing Descriptions<br />
GET /objects<br />

VICINITY_VAS_Adapter/target contains a .war file that can be deployed to an Apache Tomcat server<br />
VICINITY_VAS_Adapter_Spring/target contains a .jar file that can be executed from cmd with "java -jar"
