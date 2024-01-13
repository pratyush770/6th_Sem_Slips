<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .result{
            color:red;
            font-size: 18px;
        }
    </style>
</head>
<body>
    <%
    // Traditional approach
    //int n = Integer.parseInt(request.getParameter("n"));
    //int sum=0,fd=0,ld=0,r=0;
    //ld=n%10;
    //while(n!=0)
    //{
        //r = n%10;
        //fd = r;
        //n=n/10;
    //}
    //sum = fd+ld;


    // Easy approach
    String n = request.getParameter("n");
    int f,l,sum=0;
    int len = n.length();
    f = Character.getNumericValue(n.charAt(0));
    l = Character.getNumericValue(n.charAt(len-1));
    sum = f+l;
    out.println("<font color='red' size='18'>The sum of the first and the last digit is : " + sum);
    %>
    <!-- <p class="result">The sum of the first and last digit is : <%//= sum %></p> -->
</body>
</html>