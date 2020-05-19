$(document).ready(function(){

	// Select/Deselect checkboxes
	/*var checkbox = $('table tbody input[type="checkbox"]');

	$("#selectAll").click(function(){
		if(this.checked){
			checkbox.each(function(){
				this.checked = true;                        
			});
		} else{
			checkbox.each(function(){
				this.checked = false;                        
			});
		} 
	});

	checkbox.click(function(){	
		if(!this.checked){
			$("#selectAll").prop("checked", false);
		}
	});	
*/
	

});

function deleteRow(currentRowId) {
   
	 $.ajax({
			type: "POST",
			url: "/SampleHelloWorldApplication/employee/delete/" + currentRowId,
			cache: false,
			success : function(data) {
				
				$("#delete-row").parent().remove();
				
			},
			error : function(e) {
				console.log("ERROR: ", e);
				
			}
			
		});
 }

function editEmployee(employeeId){
	
	    $("#editName").val($("#empname"+employeeId).text());
		$("#editEmail").val($("#empemail"+employeeId).text());
		$("#editAddress").val($("#empaddress"+employeeId).text());
		$("#editTelephone").val($("#emptelephone"+employeeId).text());
		$("#editEmployeeModal").modal("toggle");
		$("#editId").val(employeeId);
	/*window.href="http://localhost:8082/SampleHelloWorldApplication/editEmployee/"+employeeId;
	$("#editEmployeeModal").modal("toggle");*/
}