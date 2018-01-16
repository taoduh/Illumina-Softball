package com.illumina.alexa.softballskill.app

import com.illumina.alexa.softballskill.data.Schema.{Player, Position}
import com.illumina.alexa.softballskill.data.PlayerData.players
import com.illumina.alexa.softballskill.data.Schema.{Player, Position}

object PlayerService {

  // Drop your ID in here. 60 = Todd
  val myPlayerId: Int = ???

  // use this if it makes sense to you. I did but it's not the only way
  lazy val noPlayer: Player = new Player(0, 0, "No", "Player", Position.Catcher, 0)

  /*
   * returns the whole record for myPlayerId
   */
  def myPlayerRecord: Player = ???

  /*
   * returns name of team captain
   */
  def myCaptainName: String = ???

  /*
   * returns names of players on the team of playerId (excluding the self)
   */
  def teammateNames(playerId: Int): Seq[String] = ???

  /*
   * Below are methods which call the above API for my team as defined by myPlayerId
   */

  def myTeammateNames: Seq[String] = teammateNames(PlayerService.myPlayerId)
  // convert myTeammateNames to a string that Alexa can read.  Abbreviate if you want the response to be shorter
  def mySomeTeammateNamesFormatted: String = ???

}
