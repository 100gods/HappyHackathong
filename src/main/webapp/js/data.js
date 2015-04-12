
$(function(){


		$(".slider")
		.slider({
			max: 5,
			step: 0.1,
			value: 2.5,
			change: function(event, ui) {

				var sliderType = $(this).attr("id");
				var value = ui.value;
				console.log( sliderType );
				console.log( value );
				getData();
			},
			create: sliderTooltip,
			slide: sliderTooltip
		})
		.slider("pips", {
			rest: "pip"
		});
		
		
		var words = [{ 'text': 'aman', 'weight' : 1 }, { 'text': 'swapnil', 'weight' : 2 }, { 'text': 'ankit', 'weight' : 3 },
		{ 'text': 'shashank', 'weight' : 4 }];
		$('#wordCloud').jQCloud(words);
		
		
		
		 $(".container").on("click", ".btn.btn-default",function(){
			$(".btn.btn-default").removeClass("active");
			$(this).addClass("active");
		 });


		getData();
		
});

var initialValue = 2.5;
var sliderTooltip = function(event, ui) {
    var curValue = ui.value || initialValue;
    var target = ui.handle || $('.ui-slider-handle');                                     
    var tooltip = '<div class="tooltip"><div class="tooltip-inner">' + curValue + '</div><div class="tooltip-arrow"></div></div>';
   $(target).html(tooltip);
}




function getData(){

	$.ajax({
		method : "POST",
		url : "",
		dataType : "json",
		data : {
			"value" : $("#value").slider('value'),
			"rooms" : $("#rooms").slider('value'),
			"cleanliness" : $("#cleanliness").slider('value'),
			"service" : $("#service").slider('value'),
			"type" : $(".active").val(),
			"bussService" : $("#businessservices").slider('value'),
			"locations" : $("#location").slider('value'),
			"checkIn" : $("#checkinCheckout").slider('value')
		},
		success: function(response){
			console.log("response");
			console.log(response);
			$('#keywords').jQCloud('update', response);
		},
		error: function(err){
			alert(err);
		}
	})
}