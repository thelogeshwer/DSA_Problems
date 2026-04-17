// using Sine it do the side values to Rad in (-90 to 90)
public:

    vector<double> internalAngles(vector<int>& sides) {
        /*
            
        */
        vector<double> ans;
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        if(a+b<=c || b+c<=a || c+a<=b) return {};
        double s = (a+b+c)/2;

        if(s*(s-a)*(s-b)*(s-c)<0) return{};
        double delta = sqrt(s*(s-a)*(s-b)*(s-c));

        double R = (a*b*c)/ (4*delta);

        for(double side : sides){
            double angleRadian = asin(side/(2*R));
            double angleDegree = (angleRadian * 180) /numbers::pi;    
            if(a*a + b*b + c*c - 2*side*side < 0){
                angleDegree = 180-angleDegree;
            }
            ans.push_back(angleDegree);
        }

        sort(ans.begin(), ans.end());
        return ans;
     
    }





// using cosine it simply do the side values to Rad in (0 - 180)
vector<double> internalAngles(vector<int>& sides) {
        /*
            a = bc
            b= ca
            c = ab
            check valid triangle = ab+ac > bc, bc+ab > ca, ca+bc>ab  
        */

        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        // triangle inequality check (positive area)
        if (a + b <= c || b + c <= a || c + a <= b)
            return {};

        // Law of Cosines
        double A = acos((b*b + c*c - a*a) / (2*b*c)) * 180.0 / M_PI;
        double B = acos((a*a + c*c - b*b) / (2*a*c)) * 180.0 / M_PI;
        double C = acos((a*a + b*b - c*c) / (2*a*b)) * 180.0 / M_PI;

        vector<double> ans = {A, B, C};
        sort(ans.begin(), ans.end());
        return ans;   
    }