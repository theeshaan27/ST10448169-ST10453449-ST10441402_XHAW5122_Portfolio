// scripts.js

function calculateFees() {
  const courses = document.querySelectorAll('input[name="course"]:checked');
  let total = 0;

  courses.forEach((course) => {
    total += parseInt(course.value);
  });

  // Apply discount based on number of courses selected
  let discount = 0;
  if (courses.length === 2) {
    discount = total * 0.05;
  } else if (courses.length === 3) {
    discount = total * 0.10;
  } else if (courses.length > 3) {
    discount = total * 0.15;
  }

  let finalCost = total - discount;
  document.getElementById('totalCost').innerText = `Total Cost: R${finalCost}`;
}
