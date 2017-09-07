//import models.Lead
//import models.Lead.format
//
//val lead = Lead(4900073,
//                format.parse("25.04.17"),
//                5443,Some(289228422),
//                "Email",
//                "ilias17@gmx.de",
//                None,
//                Some("Lexus"),
//                Some("LFA"))
//
//val ret = lead.duration_seconds.getOrElse[Long](0)
//
//
//if (lead.duration_seconds.isEmpty)
//  println("ist 0")
//else
//  println("ist nicht 0")



//val format = new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
//
//val date = format.parse("25.04.17 12:40:10")
//val ret = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"))
////
////val dt = LocalDate.parse("25.04.17 12:40:10", DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"))
//
//
////val date = LocalDate.parse("12:40:10", DateTimeFormatter.ofPattern("HH:mm:ss"))
////date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
//
//
//val date = LocalDate.now
//val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss")
//val text = date.format(formatter)
//val parsedDate = LocalDate.parse(text, formatter)


//import java.time.LocalDateTime
//import java.time.format.DateTimeFormatter
//
//val str = "25.04.2017 12:30:10"
//val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")
//val dateTime = LocalDateTime.parse(str, formatter)
//
//
//import java.time.LocalDateTime
//val dateTime2 = LocalDateTime.parse(str, formatter)
//val formattedDateTime = dateTime2.format(formatter)
//dateTime2.getYear
//
//
//val format = new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
//val date = format.parse(str)
//date.getYear


//import java.text.SimpleDateFormat
//import java.util.Date
//
//val date = new SimpleDateFormat("dd.MM.yyyy")
//val time = new SimpleDateFormat("HH:mm:ss")
//val d = date.format(new Date())
//val t = time.format(new Date())
//val date = format.parse(dateInString)

