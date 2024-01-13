<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
    String email = request.getParameter("t1");
    char ch;
    int cnt1=0,cnt2=0,i;
    for(i=0;i<email.length();i++)
    {
        ch = email.charAt(i);
        if(ch=='@')
        {
            cnt1++;
        }
        else if(ch=='.')
        {
            cnt2++;
        }
    }
    if(cnt1==1 && cnt2==1)
    {
        out.println("Valid Email");
    }
    else
    {
        out.println("Invalid Email");
    }
    %>
</body>
</html>