fetch("/me")
    .then((response) => response.json())
    .then((json) => document.getElementById('name').innerHTML = `Hello, ${json.displayName}`)