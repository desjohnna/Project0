package dev.gray.dto;

import java.util.Objects;


public class Timesheet {


    private Integer employeeId;
    private String firstName;
    private String lastName;
    private Integer hoursWorked;
    private Boolean holidayPay;
    private Integer holidayBank;
    private Boolean ptoUsed;
    private Integer ptoHoursUsed;
    private Integer ptoBank;
    private Integer date;

    public Timesheet() {

    }

    public Timesheet(Integer employeeId, String firstName, String lastName, Integer hoursWorked, Boolean holidayPay, Integer holidayBank, Boolean ptoUsed, Integer ptoHoursUsed, Integer ptoBank, Integer date) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hoursWorked = hoursWorked;
        this.holidayPay = holidayPay;
        this.holidayBank = holidayBank;
        this.ptoUsed = ptoUsed;
        this.ptoHoursUsed = ptoHoursUsed;
        this.ptoBank = ptoBank;
        this.date = date;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Boolean getHolidayPay() {
        return holidayPay;
    }

    public void setHolidayPay(Boolean holidayPay) {
        this.holidayPay = holidayPay;
    }

    public Integer getHolidayBank() {
        return holidayBank;
    }

    public void setHolidayBank(Integer holidayBank) {
        this.holidayBank = holidayBank;
    }

    public Boolean getPtoUsed() {
        return ptoUsed;
    }

    public void setPtoUsed(Boolean ptoUsed) {
        this.ptoUsed = ptoUsed;
    }

    public Integer getPtoHoursUsed() {
        return ptoHoursUsed;
    }

    public void setPtoHoursUsed(Integer ptoHoursUsed) {
        this.ptoHoursUsed = ptoHoursUsed;
    }

    public Integer getPtoBank() {
        return ptoBank;
    }

    public void setPtoBank(Integer ptoBank) {
        this.ptoBank = ptoBank;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Timesheet timesheet = (Timesheet) o;
        return employeeId.equals(timesheet.employeeId) && firstName.equals(timesheet.firstName) && lastName.equals(timesheet.lastName) && Objects.equals(hoursWorked, timesheet.hoursWorked) && Objects.equals(holidayPay, timesheet.holidayPay) && holidayBank.equals(timesheet.holidayBank) && Objects.equals(ptoUsed, timesheet.ptoUsed) && Objects.equals(ptoHoursUsed, timesheet.ptoHoursUsed) && ptoBank.equals(timesheet.ptoBank) && date.equals(timesheet.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, hoursWorked, holidayPay, holidayBank, ptoUsed, ptoHoursUsed, ptoBank, date);
    }

    @Override
    public String toString() {
        return "dev.gray.DTO.Timesheet{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", holidayPay=" + holidayPay +
                ", holidayBank=" + holidayBank +
                ", ptoUsed=" + ptoUsed +
                ", ptoHoursUsed=" + ptoHoursUsed +
                ", ptoBank=" + ptoBank +
                ", date=" + date +
                '}';
    }
}
