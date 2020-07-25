function x = vekmax(v)
% MatLab- Standardfunktionen x = max(abs(v))
% mit Schleife:
n = length(v);
x = abs(v(1));
for i = 2 : n
    if abs(v(i)) > x
        x = abs(v(i));
    end
end