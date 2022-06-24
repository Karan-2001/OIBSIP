package com.example.quizapp

data class data_class(var question:String,
                      var options_list:List<String>,
                      var answerkey:String,
                      var ansId: String,
                      var opt:Int)
val q_01 =data_class(
        "Which among the following is not an operating system?",
        listOf( "UNIX","LINUX","OS X","PITEX"),
        "PITEX", "PITEX",
        3


)
val q_02 =data_class(
        "Byte is the series of ……………… bits.",
        listOf( "2","5","8","12"),
        "8",
        "8",
        2
)
val q_03 =data_class(
        "While sending an email, sometimes you also add multiple recipients in ‘CC;’ CC stands for …",
        listOf( "Carbon copy",
                "Creative copy",
                "Carbon common",
                "Creative common"),
        "Carbon copy",
        "Carbon copy",
        0
)
val q_04 =data_class(
        "Which among the following controls all parts of the computer and known as the brain of computer?",
        listOf( "RAM",
                "ROM ",
                "CPU",
                "Processor"),
        "CPU ",
        "CPU ",
        2

)
val q_05 =data_class(
"Based on their development, arrange the following computer programing languages …1) Perl,2) Python,3) Ruby,4) Java Script,Choose the correct answer from the codes given below:",
        listOf( " 1, 2, 3, 4",
        " 2, 1, 3, 4",
        "1, 2, 4, 3 ",
        " 3, 1, 2, 4 "),
        "1,2,3,4",
        "1,2,3,4",
        3
)
val q_06=data_class(
"The type of computer,which has the properties of both ie,analogues computer and digital computer,is known as..",
listOf( "Analogue cum Digital Computer",
"Super Computer ",
"Hybrid Computer ",
"Computer of the Future "),
"Hybrid Computer ",
        "Hybrid Computer ",
2
)
val q_07=data_class(
"The computer malware that disguises users by representing itself as legitimate software?program is known as..",
listOf( "Virus",
"Worms ",
"Trojans ",
"Spyware "),
"Trojans ",
        "Trojans ",
        2

)
val q_08=data_class(
"If you need to copy a text in MS Word,Which Command do you use?",
listOf( "Ctrl+X",
"Ctrl+C",
"Ctrl+V ",
"Ctrl+Z "),
"Ctrl+C ",
        "Ctrl+C ",
1
)
val q_09=data_class(
"Which among the following is a shortcut key to search a file or folder in your computer system?",
listOf( "F1",
"F3",
"F10 ",
"Ctrl+T "),
"F3 ",
        "F3",
        1
)
val q_10=data_class(
"Who among the following is the most popular as the first computer programmer?",
listOf( "Ada Lovelace",
"Adam Osborne ",
"Adi Shamir ",
" Alain Glavieux"),
"Ada Lovelace",
        "Ada Lovelace",
        0
)
val q_11=data_class(
"Whic among the following is not an input device in a computer?",
listOf( "Optical Character Recognition",
"Speech Recognition system ",
"Touch Screen ",
"Screen Image Projector"),
"Screen Image projector",
        "Screen Image projector",
        3
)
val q_12=data_class(
"As soon as user logs in to his or her computer the boot routine performs",
listOf( "Disk drive test",
"Power on self test ",
"Motherboard test ",
"CPU test "),
"Power on self test",
        "Power on self test ",
        1
)

val q_13=data_class(
"In an internet world,each computer is known as..",
listOf( "User",
"Host ",
"Guest ",
"Internet User "),
" Host",
        " Host",
        1
)
val q_14=data_class(
"Which among the following correctly explains the term internet",
listOf( "Internet network",
" International network",
"Intercontinental network",
"Information network"),
"International network",
        "International network ",
        1
)
val q_15=data_class(
"A person who uses his expertise to gain access of other’s computer illegally is known as …",
listOf( " Programmer",
"Hacker",
"Hobbyist ",
"Spammer "),
"Hacker",
        "Hacker",
        1

)
val q_16=data_class(
"A computer keyboard has ………… functions (F) keys.",
listOf( "9",
"12",
" 13",
"17 "),
"13 ",
        "13 ",
        2
)
val q_17=data_class(
"Which among the following is incorrectly matched?",
listOf( " ALGOL Algorithmic Language",
" COMAL Common Algorithmic Language",
"APL A Programing Language ",
" SQL Simply Qualified Language" ),
" SQL Simply Qualified Language ",
        " SQL Simply Qualified Language",
        3
)
val q_18=data_class(
"Which among the following term is used to define the error in computer programing that produces wrong result?",
listOf( "Virus",
"Cookies ",
"Bug",
"Trojan"),
"Bug ",
        "Bug ",
        2
)
val q_19=data_class(
"Which among the following correctly defines the term ‘Home Page’ of a website?",
listOf( "Most Viewed Page",
"Most attractive Page ",
" Having maximum content, image, and/or video ",
"Landing Page or First Page "),
"Landing Page or First Page ",
        "Landing Page or First Page ",
        3
)
val q_20=data_class(
"Which among the following was the first computer virus detected in India?",
listOf( "Good Morning",
"I Love You ",
"Melissa ",
"Happy Birthday Joshi "),
"Happy Birthday Joshi ",
        "Happy Birthday Joshi ",
        3
)



class Obj_list{
    fun send_obj():List<data_class>{
        return listOf(q_01, q_02, q_03, q_04,q_05,q_06,q_07, q_08, q_09, q_10, q_11, q_12, q_13, q_14, q_15, q_16,q_17,q_18,q_19,q_20)
    }

}