# BadmintonProgram
Pre-Requiste & Technology
1.Maven
2.SpringBoot 
3.Hibernate - To presist data
4.PostMan - To test the Rest service
5.MySQL - DB
6.Eclipse

Execute Method and URL.
1.Deploy the latest code from GITHUB and Build project using Maven
2.Run the server from eclipse, no need to add any server as all configuration taken care inside maven.Refer the POM.XML to cross check on the dependency for the project to build.
4.http://localhost:8080/points  - GET- To pull all the data
5.http://localhost:8080/points - POST - calculate the score and insert the data 
6. For POST, take the input from the files and trigger the request in POSTMAN (Which can be used as plugin in chrome browsers)
7.First trigger the POST request so as to have data in DB
8. In application properties spring.jpa.hibernate.ddl-auto=create - So that evertime the table gets created (We can have this as UPDATE so to manintain previous data)


Assumptions
1.Its only for single players but it can be extended.
2.More logic handled in Java and made the DB side simple.(Can be done other way around)
3.Junit is included, but test suit not implemented to test the scenario as it is carried out by postman.
4.Done for single match , but can be extended for more matches.
5.There are scopes for betterment of the existing code, but concentrated more on the core and technology as other parts little more time consuming.But happy to structure it more if this soultion is acceptable.


Sampleout Response in JSON format for POST Request(TESTED FOR 3 GAMES):
{
    "matchid": 1,
    "players": [
        {
            "players1": "John",
            "players2": "Adam"
        }
    ],
    "matchWinner": "John",
    "gameScores": [
        {
            "gameID": 1,
            "gameWinner": "John",
            "gameScores": {
                "Adam": 1,
                "John": 21
            }
        },
        {
            "gameID": 2,
            "gameWinner": "John",
            "gameScores": {
                "Adam": 1,
                "John": 21
            }
        },
        {
            "gameID": 3,
            "gameWinner": "Adam",
            "gameScores": {
                "Adam": 21,
                "John": 1
            }
        }
    ]
}


