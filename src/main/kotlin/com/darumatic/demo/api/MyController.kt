package com.darumatic.demo.api

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
@RestController
class MyController {

    @GetMapping("/api/data")
    fun loadData(): String {
        return """
         
           {
             "resource": [
               {
                 "id": 1,
                 "ordinal": 0,
                 "contact_id": 1,
                 "info_type": "home",
                 "phone": "500 555-0162",
                 "email": "jon24@example.com",
                 "address": "3761 N. 14th St",
                 "city": "MEDINA",
                 "state": "ND",
                 "zip": "58467",
                 "country": "USA"
               },
               {
                 "id": 2,
                 "ordinal": 0,
                 "contact_id": 1,
                 "info_type": "work",
                 "phone": "500 555-0110",
                 "email": "jon24@example.net",
                 "address": "2243 W St.",
                 "city": "MEDINA",
                 "state": "ND",
                 "zip": "58467",
                 "country": "USA"
               }
             ]
           }
        """.trimIndent()
    }

}