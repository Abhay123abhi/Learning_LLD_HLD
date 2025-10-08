package lowLevelDesign.DesignPattern.StructuralPatterns.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDao employeeDaoObj;

    EmployeeDaoProxy() {
        employeeDaoObj = new EmployeeDaoImpl();
    }


    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDaoObj.create(client, obj);
            return;
        } else {
            throw new Exception("Access Denied");
        }
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDaoObj.delete(client, employeeId);
            return;
        } else {
            throw new Exception("Access Denied");
        }
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDaoObj.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
}

/*
“If the proxy has-a relationship with the EmployeeDaoImpl class (the concrete implementation),
then why does it hold a reference of type EmployeeDao (the interface) instead of EmployeeDaoImpl

Answer - Because now your proxy is tightly coupled to one specific implementation class.
If tomorrow you make another implementation (e.g., EmployeeDaoJdbcImpl or EmployeeDaoHibernateImpl),
you’d need to rewrite or duplicate your proxy class.

That violates Open/Closed Principle (SOLID rule: classes should be open for extension, closed for modification).
 */
