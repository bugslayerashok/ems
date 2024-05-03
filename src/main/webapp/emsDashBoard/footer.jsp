</div>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/2.0.3/js/dataTables.js"></script>
<script src="https://cdn.datatables.net/2.0.3/js/dataTables.bootstrap5.js"></script>
<script src="https://cdn.datatables.net/responsive/3.0.1/js/dataTables.responsive.js"></script>
<script src="https://cdn.datatables.net/responsive/3.0.1/js/responsive.bootstrap5.js">
</script>
<script>
function removeParam(key, sourceURL) {
    var rtn = sourceURL.split("?")[0],
        param,
        params_arr = [],
        queryString = (sourceURL.indexOf("?") !== -1) ? sourceURL.split("?")[1] : "";
    if (queryString !== "") {
        params_arr = queryString.split("&");
        for (var i = params_arr.length - 1; i >= 0; i -= 1) {
            param = params_arr[i].split("=")[0];
            if (param === key) {
                params_arr.splice(i, 1);
            }
        }
        if (params_arr.length) rtn = rtn + "?" + params_arr.join("&");
    }
    return rtn;
}
</script>
<%
String message = request.getParameter("message");
String type = request.getParameter("type");
	if (message != null) {
		if(type.equals("error"))
		{
			%>
			<script type="text/javascript">
				errorFun("<%=message%>");
			</script>
			<%
			message=null;
		}
		else if(type.equals("success"))
		{
	%>
	<script type="text/javascript">
		successFun("<%=message%>");
	</script>
<%
	message=null;
	}
		}%>  
  
  <script>
  $(document).ready(function (){
	    var table = $('#example').DataTable({
	    	responsive: {
	            details: {
	                type: 'column'
	            }
	        }
	    });
	});
  </script>
</body>
</html>