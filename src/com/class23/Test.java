package com.class23;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----Creating Employee object");
Employee emp=new Employee();
emp.salary=90000;
System.out.println(Employee.department);
Employee.work();
emp.getPaid();
System.out.println("---Creating ScrumTeam object");
ScrumTeam st=new ScrumTeam();
st.salary=100000;
st.getPaid();
st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
st.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
st.attendScrumMeetings();
st.workOnArtifacts();


System.out.println("---Creating Developer object");
Developer dev=new Developer();
dev.salary=120000;
dev.getPaid();
dev.artifacts="Sprint Backlog";
dev.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
dev.attendScrumMeetings();
dev.code();


System.out.println("---Creating Back ENd Developer object");
BackEdn dev1=new BackEdn();
dev1.salary=120000;
dev1.getPaid();
dev1.artifacts="Sprint Backlog";
dev1.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
dev1.attendScrumMeetings();
dev1.code();
dev1.BackEnd();


System.out.println("---Creating Front ENd Developer object");
FrotEnd dev2=new FrotEnd();
dev2.salary=120000;
dev2.getPaid();
dev2.artifacts="Sprint Backlog";
dev2.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
dev2.attendScrumMeetings();
dev2.code();
dev2.FrontEnd();


System.out.println("Creating Tester object");
Tester qa=new Tester();
qa.salary=120000;
qa.getPaid();
qa.artifacts="----Sprint Backlog";
qa.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
qa.attendScrumMeetings();
qa.test();


System.out.println("Creating Automation Tester object");
AutomationTester at=new AutomationTester();
at.salary=120000;
at.getPaid();
at.artifacts="----Sprint Backlog";
at.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
at.attendScrumMeetings();
at.test();
at.AT();



System.out.println("Creating Manual Tester object");
ManualTester ms=new ManualTester();
ms.salary=120000;
ms.getPaid();
ms.artifacts="----Sprint Backlog";
ms.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
ms.attendScrumMeetings();
ms.test();
ms.MS();


System.out.println("Creating Busines Analyst object");
BusinessAnalyst ba=new BusinessAnalyst();
ba.salary=85000;
ba.getPaid();
ba.artifacts="--Sprint Backlog";
ba.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
ba.attendScrumMeetings();
ba.writeUserStories();


System.out.println("----Creating Scrum Master object");
ScrumMaster sc=new ScrumMaster();
sc.salary=85000;
sc.getPaid();
sc.artifacts="Sprint Backlog";
sc.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
sc.attendScrumMeetings();
sc.ScrumMeetings();


System.out.println("----Creating Product Owner object");
ProductOwner po=new ProductOwner();
po.salary=115000;
po.getPaid();
po.artifacts="Sprint Backlog";
po.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
po.prioritizeBacklog();
po.talkToTheClient();






	}

}
