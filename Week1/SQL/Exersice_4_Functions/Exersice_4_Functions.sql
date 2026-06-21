DElimiter //

Create Function CalculateAge(dob Date)
returns int
deterministic
begin 
	declare age int;
    set age = year(curdate())-year(dob);
    return age;
    
end //

Delimiter ;

Delimiter //
Create function CalculateMonthlyInstallment(loanamount decimal(10,2) , intrest decimal(5,2) , lyear int)
returns decimal(10,2)
deterministic 

begin 
	declare montlyInstallement decimal(10,2);
    declare totalamount decimal(10,2);
    set  totalamount = loanamount + (loanamount * intrest * lyear)/100;
     set montlyInstallement = totalamount /( lyear *12);
    
    return montlyInstallement;
	end //
Delimiter ;


Delimiter //
Create function HasSufficientBalance(sender_accountid int  , amount int)
returns boolean
deterministic 

begin 
	declare bal decimal(10,2);
    select Balance into bal from accounts where AccountID = sender_accountid;
     if ( bal) > amount 
     then
		return true;
    else
		return false;
    end if;
    
	end //
Delimiter ;

select HasSufficientBalance(1,20000) as Do_you_have_SufficientBalance;

select CalculateMonthlyInstallment(100000,10,2) as your_MonthlyInstallment;

select CalculateAge('2005-10-12') as Your_age;