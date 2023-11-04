import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

static void main(String[] args) {
  formatOffsetDateTime()
}

def formatOffsetDateTime() {
    // 2023-10-03T17:00+08:00 turn this into OffsetDateTime
    def startDate = OffsetDateTime.parse("2023-10-07T23:53:39Z")

    def dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")

    def startDateFormatted = startDate != null ? startDate.format(dateFormatter) : ""

    println startDate.toString()
    println startDateFormatted
}

def formatLocalDateTime() {
  // 2023-10-03T17:00 turn this into LocalDateTime
  def startDate = LocalDateTime.parse("2023-10-03T17:00")

  def dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

  def startDateFormatted = startDate != null ? startDate.format(dateFormatter) : ""

  println startDate.toString()
  println startDateFormatted
}