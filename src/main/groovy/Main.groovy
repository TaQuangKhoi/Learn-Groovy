import java.time.LocalDateTime

static void main(String[] args) {
  // 2023-10-03T17:00 turn this into LocalDateTime
  def startDate = LocalDateTime.parse("2023-10-03T17:00")

  def dateFormatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd")

  def startDateFormatted = startDate != null ? startDate.format(dateFormatter) : ""

  println startDate.toString()
  println startDateFormatted
}