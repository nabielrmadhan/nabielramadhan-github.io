data = [{
    'img1': 'assets/NABIEL.jpg',
    'img2': 'assets/NABIEL.jpg',
    'title': 'Web E-commerce',
    'subtitle': 'Zenit',
    'desc' : 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolores?'
}, {
    'img1': 'assets/NABIEL.jpg',
    'img2': 'assets/NABIEL.jpg',
    'title': 'Web E-commerce',
    'subtitle': 'Zenit',
    'desc' : 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolores?'
}]

var container = document.querySelector('#Project')

data.forEach(element => {
    container.innerHTML += 
    `<div class="project">
    <div class="img-project">
        <img src="`+element.img1+`" alt="">
    </div>
    <div class="desc-project">
        <h1>${element.title}</h1>
        <h2>${element.title}</h2>
        <p>${element.desc}<p>
    </div>
    <button class="read-more">read more</button>
</div>`

});