"use strict";

function submitAction(entry) {

  var entry = $("input").first().val()
  if (entry === "hi")
  {
    $("span").text("Validated").show();

  }
  $( "span" ).text( "Not valid!" ).show().fadeOut( 1000 );
  event.preventDefault();
};
