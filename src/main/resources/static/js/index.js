fetch('/me')
    .then((response) => response.json())
    .then((json) => document.getElementById('display-name').innerHTML = `Hello, ${json.displayName}`)

fetch('/notebooks')
    .then((response) => response.json())
    .then((json) => document.getElementById('notebooks').innerHTML = json.map((notebook) => `<li>${notebook.displayName}</li>`).join(''))
