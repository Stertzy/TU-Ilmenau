clear, clc, format compact

A = [2 1 2 4;1 2 10 -1;-1 0 3 -1;2 1 3 1];disp(A)
b = [1 3 2 7 ]';disp(b)

[R1,y1] = my_gauss(A,b);
x =  Lsg_re_ob_Ma( R1 ,y1);
[R,L]= my_LR(A);
A1 =L*R
y2 = Lsg_li_un_Ma( L ,b);
x2 = Lsg_re_ob_Ma( R ,y2);
 % Standardfunktion von MatLab:
x1 = A\b;
disp('y Werte:'),disp([x,x1,x2])
disp('x Werte:'),disp([y1,y2])
