$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desktop.feature");
formatter.feature({
  "line": 1,
  "name": "Desktop",
  "description": "",
  "id": "desktop",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3991545700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on desktop tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on show all desktop",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Add to cart option on Canon EOS5D",
  "keyword": "And "
});
formatter.match({
  "location": "DesktopTestStepDef.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 1761760900,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestStepDef.user_clicks_on_desktop_tab()"
});
formatter.result({
  "duration": 171378200,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestStepDef.user_clicks_on_show_all_desktop()"
});
formatter.result({
  "duration": 397361500,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestStepDef.user_clicks_on_Add_to_cart_option_on_Canon_EOS_D()"
});
formatter.result({
  "duration": 1288277300,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "User Review on Canon Camera",
  "description": "",
  "id": "desktop;user-review-on-canon-camera",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@Review"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "User clicks on write a Review Link",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User fill the review information with belwo information",
  "rows": [
    {
      "cells": [
        "yourName",
        "yourReview",
        "Rating"
      ],
      "line": 41
    },
    {
      "cells": [
        "JackMa",
        "i found everthing very easy and the UI is very user friendly",
        "good"
      ],
      "line": 42
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User sould see a messege with Thank you for your review. it has been submitted to the webMaster for approval",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopTestStepDef.user_clicks_on_write_a_Review_Link()"
});
formatter.result({
  "duration": 69478600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestStepDef.user_fill_the_review_information_with_belwo_information(DataTable)"
});
formatter.result({
  "duration": 568664700,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestStepDef.user_clicks_on_continue_Button()"
});
formatter.result({
  "duration": 60720300,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestStepDef.user_sould_see_a_messege_with_Thank_you_for_your_review_it_has_been_submitted_to_the_webMaster_for_approval()"
});
formatter.result({
  "duration": 36262700,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Thank you for your review. It has been submitted to the webmaster for approval].\u003e but was:\u003c[Loading..].\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.DesktopTestStepDef.user_sould_see_a_messege_with_Thank_you_for_your_review_it_has_been_submitted_to_the_webMaster_for_approval(DesktopTestStepDef.java:139)\r\n\tat ✽.Then User sould see a messege with Thank you for your review. it has been submitted to the webMaster for approval(desktop.feature:44)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 4707882800,
  "status": "passed"
});
});