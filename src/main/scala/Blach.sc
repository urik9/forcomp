import forcomp.Anagrams.Occurrences

val occurrences = List(("a", 2),("b", 2))

def combinations(occurrences: Occurrences):List[Occurrences] = {
  for {
    o <- 0 until occurrences.length

  }
yield (o, occurrences)

}

def combinations1(occurrences: Occurrences):List[Occurrences] = {
  (0 until occurrences.length)flatMap(occurrences.toMap.mapValues())

}
