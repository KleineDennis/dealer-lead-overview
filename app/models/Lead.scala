package models


import java.util.Date

/**
  * Created by denniskleine on 06.07.17.
  */
case class Lead(  lbplead_id: Long,
                  occurrence_time: Date,              //Datum, Uhrzeit
                  autoscout24_sell_id: Long,          //Dealer
//                  customer_id: Long,
                  article_id:	Option[Long],           //Angebotsnummer
//                  description: Option[String],
                  lead_type:String,                   //Email Call
                  sender: String,                     //Sender Email oder Telefonnummer
                  duration_seconds: Option[Long],     //Anrufdauer
//                  billing_relevant: Option[Boolean],
//                  billing_state: String,
//                  created, Date,
//                  original_id: String,
//                  report_sent: Date,
//                  owners_offer_key: Option[String],
                  make: Option[String],               //Marke
                  model: Option[String],              //Modell
//                  message_cause: Option[String]
               )


object Lead {

  val format = new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm:ss")

  var leads = Set(
    Lead(4900073, format.parse("25.04.2017 12:40:10"), 5443,       Some(289228422), "Email", "ilias17@gmx.de", None,      Some("Lexus"), Some("LFA")),
    Lead(4934454, format.parse("03.07.2017 13:40:10"), 1003849,    None,            "Call",  "15256723272",    None,   None,          None),
    Lead(4934455, format.parse("03.07.2017 14:40:10"), 1003849,    None,            "Call",  "15256723272",    None,   None,          None),
    Lead(4934456, format.parse("03.07.2017 15:40:10"), 1003849,    None,            "Email", "cxs@tre.de",     None,   None,          None),
    Lead(4934457, format.parse("03.07.2017 16:40:10"), 1003849,    None,            "Email", "ertze@tre.de",   None,   None,          None),
    Lead(4906338, format.parse("01.06.2017 17:40:10"), 2120049956, None,            "Call",  "15256723272",    Some(45), None,          None),
    Lead(4906339, format.parse("12.06.2017 18:40:10"), 2120049956, None,            "Call",  "15256723272",    Some(67), None,          None),
    Lead(4906310, format.parse("12.06.2017 21:40:10"), 2120049956, None,            "Email", "adfgad@tre.de",  None, None,          None),
    Lead(4906311, format.parse("13.06.2017 22:40:10"), 2120049956, None,            "Call",  "15256723272",    None, None,          None),
    Lead(4906312, format.parse("12.06.2017 23:40:10"), 2120049956, None,            "Call",  "15256723272",    Some(2345), None,          None)
  )

  def findAll(dealerId: Long) = leads.filter(_.autoscout24_sell_id == dealerId).toList.sortBy(_.occurrence_time)
}