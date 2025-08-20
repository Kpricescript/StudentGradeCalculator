BEGIN
    DISPLAY "Welcome to my Student Grade Calculator!"
    PROMPT "Enter student name" → studentName
    PROMPT "Enter number of subjects" → numSubjects

    DECLARE grades as integer array of size numSubjects

    FOR i = 1 TO numSubjects
        PROMPT "Enter grade for subject i"
        READ grade
        IF grade < 0 OR grade > 100 THEN
            DISPLAY "Invalid input, please re-enter"
            DECREMENT i
        ELSE
            STORE grade in grades[i]
        END IF
    END FOR

    CALCULATE totalScore = SUM(grades)
    CALCULATE averageScore = totalScore / numSubjects

    IF averageScore >= 90 THEN letterGrade = 'A'
    ELSE IF averageScore >= 80 THEN letterGrade = 'B'
    ELSE IF averageScore >= 70 THEN letterGrade = 'C'
    ELSE IF averageScore >= 60 THEN letterGrade = 'D'
    ELSE letterGrade = 'F'
    END IF

    IF letterGrade == 'F'
        status = "FAIL"
    ELSE
        status = "PASS"
    END IF

    DISPLAY final report: studentName, grades, totalScore, averageScore, letterGrade, status
END