Workplace organization composite pattern
========================================

An implementation of the composite pattern as applied to the organizational structure of a workplace.  The WorkplaceAssetComponent is an abstract class, it is extended by the WorkplacEmployee and WorkplaceTeam classes.  These provide a concrete representation of either an employee, or an employee group.  Employees and groups can be placed iwthin other groups by means of the add methods.  The print methods either print off an employee instance or iterate over and print all components within a given group.  The OrgEmployeeManager class holds methods for printing various groups.  This is basic practice with the composite pattern.


![UML diagram for project](https://github.com/cugamer/dp_composite_worplace_org/blob/master/dp_composite_workplace_org/dp_composit_workplace_org.png)
