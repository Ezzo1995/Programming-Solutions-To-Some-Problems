// Codingbat warmup-1 problem : sleepIn
// Problem Link: http://codingbat.com/prob/p187868

public boolean sleepIn(boolean weekday, boolean vacation) {
  return !weekday || vacation || !weekday&&!vacation;
}




