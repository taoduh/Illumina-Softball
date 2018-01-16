# Illumina Softball Skill

### com.illumina.alexa.softballskill

*SoftballSpeechlet* is the Alexa skill implementation.  This is implemented, it calls methods in the service layer that you will implment.

*SoftballSpeechletRequestStreamHandler* is Alexa boilerplate (in Java for now).  

### com.illumina.alexa.softballskill.data

This package contains types (Schema.scala) and hard-coded data in lieu of a database.

### com.illumina.alexa.softballskill.app

The app folder is where the action is.  Here there are methods to slice and dice the data for Alexa's pleasure.


### Potential improvements
- Improve the data model to better match the game (e.g. game and inning-specific batting orders)
- More data (at-bats, fielding?), perhaps filled with random values via [a fake data tool](https://github.com/justwrote/scala-faker)
- Basic stats from the above (e.g. RBIs, slugging)
- Fun with advanced statistic (which players are the most valuable)
- A conversational skill that maintains state
- Convert SoftballSpeechletRequestStreamHandler to scala
