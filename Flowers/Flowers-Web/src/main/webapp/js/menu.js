// JavaScript Document

var jq = jQuery.noConflict();
jQuery(function(){
	jq(".leftNav ul li").hover(
		function(){
			jq(this).find(".fj").addClass("nuw");
			jq(this).find(".zj").show();
		}
		,
		function(){
			jq(this).find(".fj").removeClass("nuw");
			jq(this).find(".zj").hide();
		}
	)
	
	$("#deleteA").click(function(){
      alert(121213)
      /* vall = $("#deleteA").next().val();
       alert(vall);
      ShowDiv('MyDiv','fade');
     */
     
     })
})
var cid;
var uid;

  function sDelete(pvall,uvall){
	  cid=pvall;
	  uid=uvall;
	   
	ShowDiv('MyDiv','fade');
    
  }
  function sureDelete(){	 
	 
	  location.href="DelteCarServelt?cid="+cid+"&uid="+uid+"";
  }
